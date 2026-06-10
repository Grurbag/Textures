// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneLegs extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer nakolennik_r1;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer nakolennik_r2;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer RightLeg_r4;

	public WFMModelKhorneLegs() {
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.25F, false);

		nakolennik_r1 = new ModelRenderer(this);
		nakolennik_r1.setPos(-2.3733F, 6.4711F, 0.0F);
		RightLeg.addChild(nakolennik_r1);
		setRotationAngle(nakolennik_r1, -0.7854F, 0.0F, 0.0436F);
		nakolennik_r1.texOffs(0, 56).addBox(-1.9267F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.7F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(-1.0F, -1.0F, 1.0F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, 0.0436F);
		RightLeg_r1.texOffs(45, 1).addBox(-3.0F, 2.0F, -3.5F, 4.0F, 4.0F, 5.0F, 0.7F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(0, 0).addBox(-3.0F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.25F, true);

		nakolennik_r2 = new ModelRenderer(this);
		nakolennik_r2.setPos(1.8267F, 6.4711F, 0.0F);
		LeftLeg.addChild(nakolennik_r2);
		setRotationAngle(nakolennik_r2, -0.7854F, 0.0F, -0.0436F);
		nakolennik_r2.texOffs(0, 56).addBox(-1.5F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.7F, false);

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(0.0F, 0.0F, 1.0F);
		LeftLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0F, 0.0F, -0.0436F);
		RightLeg_r3.texOffs(45, 1).addBox(0.0F, 1.0F, -3.5F, 4.0F, 4.0F, 5.0F, 0.7F, false);

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.0F, 0.0F, -0.0436F);
		RightLeg_r4.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}