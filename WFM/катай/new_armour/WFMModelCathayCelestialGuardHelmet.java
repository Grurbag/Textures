// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayCelestialGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer tail;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer dragonhead;
	private final ModelRenderer dragonhead_r1;
	private final ModelRenderer dragon_head2;
	private final ModelRenderer dragonhead_r2;

	public WFMModelCathayCelestialGuardHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 22).addBox(-2.5F, -11.1779F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		Head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0007F, -11.3258F, 6.5959F);
		Head.addChild(tail);
		tail.texOffs(24, 25).addBox(-1.0F, -1.8971F, -6.55F, 2.0F, 4.0F, 2.0F, -0.2F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, 0.0F, 1.0F);
		tail.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.texOffs(52, 40).addBox(-1.0007F, 4.5F, -1.5959F, 2.0F, 4.0F, 3.0F, -0.3F, false);
		head_r1.texOffs(50, 30).addBox(-1.5F, 1.5F, -2.0F, 3.0F, 4.0F, 4.0F, -0.3F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -3.8971F, -1.25F);
		tail.addChild(head_r2);
		setRotationAngle(head_r2, 0.5236F, 0.0F, 0.0F);
		head_r2.texOffs(46, 16).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 9.0F, 5.0F, -0.2F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(0.0F, -3.271F, -3.9445F);
		tail.addChild(head_r3);
		setRotationAngle(head_r3, 1.8762F, 0.0F, 0.0F);
		head_r3.texOffs(30, 16).addBox(-2.0F, -3.0F, -1.6F, 4.0F, 7.0F, 4.0F, -0.4F, false);

		dragonhead = new ModelRenderer(this);
		dragonhead.setPos(-0.2164F, -1.0F, -7.9763F);
		Head.addChild(dragonhead);
		setRotationAngle(dragonhead, 0.0F, 0.5672F, 0.0F);
		dragonhead.texOffs(46, 48).addBox(-9.0F, -14.0F, 0.0F, 9.0F, 16.0F, 0.0F, 0.0F, false);

		dragonhead_r1 = new ModelRenderer(this);
		dragonhead_r1.setPos(0.0F, 1.0F, 1.0F);
		dragonhead.addChild(dragonhead_r1);
		setRotationAngle(dragonhead_r1, 0.0F, 0.0F, -0.1309F);
		dragonhead_r1.texOffs(28, 48).addBox(-9.0F, -10.0F, -1.4237F, 9.0F, 8.0F, 0.0F, 0.0F, false);

		dragon_head2 = new ModelRenderer(this);
		dragon_head2.setPos(0.0F, 0.0F, 0.0F);
		dragonhead.addChild(dragon_head2);
		setRotationAngle(dragon_head2, 0.0F, 2.0508F, 0.0F);
		dragon_head2.texOffs(46, 48).addBox(-9.0F, -14.0F, 0.0F, 9.0F, 16.0F, 0.0F, 0.0F, false);

		dragonhead_r2 = new ModelRenderer(this);
		dragonhead_r2.setPos(0.0F, 1.0F, 1.0F);
		dragon_head2.addChild(dragonhead_r2);
		setRotationAngle(dragonhead_r2, 0.0F, 0.0F, -0.1309F);
		dragonhead_r2.texOffs(28, 48).addBox(-9.0F, -10.0F, -0.5237F, 9.0F, 8.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}