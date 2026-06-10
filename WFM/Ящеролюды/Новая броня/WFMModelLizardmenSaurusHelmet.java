// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSaurusHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer greben2;
	private final ModelRenderer greben_r1;
	private final ModelRenderer jawTop2;

	public WFMModelLizardmenSaurusHelmet() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -5.0F, -4.0F);
		head.texOffs(82, 0).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.5F, false);

		greben2 = new ModelRenderer(this);
		greben2.setPos(0.0F, -5.0F, -5.0F);
		head.addChild(greben2);
		

		greben_r1 = new ModelRenderer(this);
		greben_r1.setPos(0.0F, 0.0F, 0.0F);
		greben2.addChild(greben_r1);
		setRotationAngle(greben_r1, 0.2618F, 0.0F, 0.0F);
		greben_r1.texOffs(76, 17).addBox(-4.5F, -1.158F, -0.0603F, 9.0F, 1.0F, 8.0F, 0.5F, false);

		jawTop2 = new ModelRenderer(this);
		jawTop2.setPos(0.0F, -3.0F, -5.0F);
		head.addChild(jawTop2);
		jawTop2.texOffs(78, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 4.0F, 7.0F, 0.5F, false);
		jawTop2.texOffs(78, 38).addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 6.0F, 0.51F, false);
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