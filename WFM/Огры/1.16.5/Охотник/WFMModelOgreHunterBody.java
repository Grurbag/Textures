// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreHunterBody extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer gut2;
	private final ModelRenderer neck2;
	private final ModelRenderer skull;
	private final ModelRenderer skull2;
	private final ModelRenderer leftArmArmour;
	private final ModelRenderer rightArmArmour;

	public WFMModelOgreHunterBody() {
		texWidth = 128;
		texHeight = 128;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(1.0F, 1.0F, 3.0F);
		bodyArmour.texOffs(54, 0).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.5F, false);
		bodyArmour.texOffs(54, 77).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.7F, false);

		gut2 = new ModelRenderer(this);
		gut2.setPos(0.0F, 0.0F, -8.0F);
		bodyArmour.addChild(gut2);
		gut2.texOffs(87, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.5F, false);
		gut2.texOffs(47, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.7F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -25.0F, 0.0F);
		bodyArmour.addChild(neck2);
		neck2.texOffs(74, 62).addBox(-9.0F, -4.0F, -5.0F, 17.0F, 4.0F, 10.0F, 0.0F, false);

		skull = new ModelRenderer(this);
		skull.setPos(-0.5F, -6.0F, -11.5F);
		bodyArmour.addChild(skull);
		setRotationAngle(skull, -0.3927F, 0.0F, 0.0F);
		skull.texOffs(0, 0).addBox(-5.5F, -7.0F, -4.5F, 11.0F, 13.0F, 8.0F, 0.0F, false);

		skull2 = new ModelRenderer(this);
		skull2.setPos(0.0F, 8.0F, 0.0F);
		skull.addChild(skull2);
		skull2.texOffs(1, 23).addBox(-4.5F, -2.0F, -3.5F, 9.0F, 6.0F, 7.0F, 0.0F, false);

		leftArmArmour = new ModelRenderer(this);
		leftArmArmour.setPos(12.0F, -19.0F, 4.0F);
		leftArmArmour.texOffs(1, 50).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, false);
		leftArmArmour.texOffs(0, 85).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, false);

		rightArmArmour = new ModelRenderer(this);
		rightArmArmour.setPos(-11.0F, -19.0F, 4.0F);
		rightArmArmour.texOffs(1, 50).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, true);
		rightArmArmour.texOffs(0, 85).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}