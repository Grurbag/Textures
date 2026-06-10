// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWitchHunterHat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat_r1;
	private final ModelRenderer hat_r2;
	private final ModelRenderer hat_r3;
	private final ModelRenderer feather_r1;

	public WFMModelWitchHunterHat() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -9.0F, 0.0F);
		head.addChild(hat);
		setRotationAngle(hat, 0.0F, 3.1416F, 0.0F);
		hat.texOffs(1, 25).addBox(-3.5F, -5.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, false);
		hat.texOffs(52, 40).addBox(-6.5F, -5.0F, -1.5F, 3.0F, 7.0F, 3.0F, -0.5F, false);
		hat.texOffs(62, 38).addBox(-5.5F, -8.5F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		hat.texOffs(29, 25).addBox(-3.5F, -5.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.1F, false);
		hat.texOffs(15, 26).addBox(-3.5F, -5.0F, 3.7F, 7.0F, 5.0F, 0.0F, 0.0F, false);
		hat.texOffs(0, 37).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		hat.texOffs(0, 37).addBox(-3.0F, -9.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		hat.texOffs(4, 37).addBox(1.0F, -9.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		hat.texOffs(38, 54).addBox(-4.5F, 3.0F, 4.5F, 9.0F, 1.0F, 4.0F, 0.0F, false);
		hat.texOffs(0, 0).addBox(-6.0F, 3.0F, 7.6F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		hat.texOffs(45, 60).addBox(4.5F, 3.0F, 4.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r1);
		setRotationAngle(hat_r1, 0.0F, -1.5708F, 0.0F);
		hat_r1.texOffs(45, 60).addBox(4.5F, 3.0F, 4.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		hat_r1.texOffs(38, 54).addBox(-4.5F, 3.0F, 4.5F, 9.0F, 1.0F, 4.0F, 0.0F, false);

		hat_r2 = new ModelRenderer(this);
		hat_r2.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r2);
		setRotationAngle(hat_r2, 0.0F, 3.1416F, 0.0F);
		hat_r2.texOffs(45, 60).addBox(4.5F, 3.0F, 4.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		hat_r2.texOffs(38, 54).addBox(-4.5F, 3.0F, 4.5F, 9.0F, 1.0F, 4.0F, 0.0F, false);

		hat_r3 = new ModelRenderer(this);
		hat_r3.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r3);
		setRotationAngle(hat_r3, 0.0F, 1.5708F, 0.0F);
		hat_r3.texOffs(45, 60).addBox(4.5F, 3.0F, 4.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		hat_r3.texOffs(38, 54).addBox(-4.5F, 3.0F, 4.5F, 9.0F, 1.0F, 4.0F, 0.0F, false);

		feather_r1 = new ModelRenderer(this);
		feather_r1.setPos(1.0F, -4.5F, 3.0F);
		hat.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.6109F, -0.829F, 0.0F);
		feather_r1.texOffs(25, 31).addBox(0.0F, -11.5F, -9.0F, 0.0F, 11.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}