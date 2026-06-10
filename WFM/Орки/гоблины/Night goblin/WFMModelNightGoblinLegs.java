// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNightGoblinLegs extends EntityModel<Entity> {
	private final ModelRenderer legLeftArmour;
	private final ModelRenderer legLeftArmour2;
	private final ModelRenderer pant;
	private final ModelRenderer legRightArmour;
	private final ModelRenderer legRightArmour2;
	private final ModelRenderer pant2;

	public WFMModelNightGoblinLegs() {
		texWidth = 64;
		texHeight = 64;

		legLeftArmour = new ModelRenderer(this);
		legLeftArmour.setPos(1.9F, 13.0F, 2.0F);
		setRotationAngle(legLeftArmour, -0.3054F, 0.0F, 0.0F);
		legLeftArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, true);

		legLeftArmour2 = new ModelRenderer(this);
		legLeftArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legLeftArmour.addChild(legLeftArmour2);
		setRotationAngle(legLeftArmour2, 0.4363F, 0.0F, 0.0F);
		legLeftArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, true);

		pant = new ModelRenderer(this);
		pant.setPos(0.0F, 0.0F, 0.0F);
		legLeftArmour.addChild(pant);
		setRotationAngle(pant, 0.3054F, 0.0F, 0.0F);
		pant.texOffs(40, 0).addBox(-2.0F, 0.0F, -5.0F, 5.0F, 10.0F, 7.0F, 0.01F, true);

		legRightArmour = new ModelRenderer(this);
		legRightArmour.setPos(-2.1F, 13.0F, 2.0F);
		setRotationAngle(legRightArmour, -0.3054F, 0.0F, 0.0F);
		legRightArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, false);

		legRightArmour2 = new ModelRenderer(this);
		legRightArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legRightArmour.addChild(legRightArmour2);
		setRotationAngle(legRightArmour2, 0.4363F, 0.0F, 0.0F);
		legRightArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, false);

		pant2 = new ModelRenderer(this);
		pant2.setPos(-1.0F, 0.0F, 0.0F);
		legRightArmour.addChild(pant2);
		setRotationAngle(pant2, 0.3054F, 0.0F, 0.0F);
		pant2.texOffs(40, 0).addBox(-2.0F, 0.0F, -5.0F, 5.0F, 10.0F, 7.0F, 0.01F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		legLeftArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRightArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}